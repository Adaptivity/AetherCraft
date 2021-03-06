package com.iconmaster.aec.aether.recipe;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.iconmaster.aec.aether.DynamicAVRegister;

public class ShapelessOreRecipeHandler implements IDynamicAVRecipeHandler {

	@Override
	public ArrayList getInputs(Object recipe) {
		return ((ShapelessOreRecipe)recipe).getInput();
	}

	@Override
	public ItemStack getOutput(Object recipe) {
		return ((ShapelessOreRecipe)recipe).getRecipeOutput();
	}
	
	@Override
	public void populateRecipeList(HashMap recipeList) {}
}
