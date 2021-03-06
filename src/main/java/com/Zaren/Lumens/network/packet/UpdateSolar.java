package com.Zaren.Lumens.network.packet;

import com.Zaren.Lumens.Lumens;
import com.Zaren.Lumens.tile.TileEntitySolarBlock;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class UpdateSolar {

    private BlockPos pos;
    private int currentEnergy;
    private int currentProduction;

    public UpdateSolar(PacketBuffer buf) {
        pos = buf.readBlockPos();
        currentEnergy = buf.readInt();
        currentProduction = buf.readInt();
    }

    public UpdateSolar(BlockPos pos, int currentEnergy, int currentProduction) {
        this.pos = pos;
        this.currentEnergy = currentEnergy;
        this.currentProduction = currentProduction;
    }

    public void toBytes(PacketBuffer buf) {
        buf.writeBlockPos(pos);
        buf.writeInt(currentEnergy);
        buf.writeInt(currentProduction);
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            World world = Lumens.proxy.getClientWorld();
            if (world.isBlockPresent(pos)) {
                TileEntity te = world.getTileEntity(pos);
                if (te instanceof TileEntitySolarBlock) {
                    TileEntitySolarBlock solar = (TileEntitySolarBlock) te;
                    solar.energyClient = currentEnergy;
                    solar.energyProductionClient = currentProduction;
                }
            }
        });
        ctx.get().setPacketHandled(true);
    }
}
