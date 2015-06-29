package com.MO.MatterOverdrive.compat.modules;

import codechicken.nei.VisiblityData;
import codechicken.nei.api.API;
import codechicken.nei.api.INEIGuiHandler;
import codechicken.nei.api.TaggedInventoryArea;
import com.MO.MatterOverdrive.compat.Compat;
import com.MO.MatterOverdrive.gui.GuiStarMap;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * @author shadowfacts
 */
@Compat("NotEnoughItems")
@Optional.Interface(iface = "codechicken.nei.api.INEIGuiHandler", modid = "NotEnoughItems")
public class CompatNEI implements INEIGuiHandler {

	@Compat.PreInit
	public static void preInit(FMLPreInitializationEvent event) {
		API.registerNEIGuiHandler(new CompatNEI());
	}

	@Override
	public VisiblityData modifyVisiblity(GuiContainer guiContainer, VisiblityData visiblityData) {
		if (guiContainer instanceof GuiStarMap) {
			visiblityData.showNEI = false;
		}
		return visiblityData;
	}

	@Override
	public Iterable<Integer> getItemSpawnSlots(GuiContainer guiContainer, ItemStack itemStack) {
		return null;
	}

	@Override
	public List<TaggedInventoryArea> getInventoryAreas(GuiContainer guiContainer) {
		return null;
	}

	@Override
	public boolean handleDragNDrop(GuiContainer guiContainer, int i, int i1, ItemStack itemStack, int i2) {
		return false;
	}

	@Override
	public boolean hideItemPanelSlot(GuiContainer guiContainer, int i, int i1, int i2, int i3) {
		return false;
	}
}