package nc.integration.crafttweaker.ingredient;

import java.util.List;

import crafttweaker.api.item.IIngredient;
import crafttweaker.api.item.IItemCondition;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.item.IItemTransformer;
import crafttweaker.api.item.IItemTransformerNew;
import crafttweaker.api.liquid.ILiquidStack;
import crafttweaker.api.player.IPlayer;
import nc.integration.crafttweaker.CTHelper;
import nc.recipe.ingredient.ChanceFluidIngredient;

public class CTChanceFluidIngredient implements IChanceFluidIngredient {
	
	private final IIngredient internalIngredient;
	private final int chancePercent;
	private final int stackDiff;
	private final int minStackSize;
	private final ChanceFluidIngredient chanceIngredient;
	
	public CTChanceFluidIngredient(IIngredient ingredient, int chancePercent, int stackDiff, int minStackSize) {
		this.internalIngredient = ingredient;
		this.chancePercent = chancePercent;
		this.stackDiff = stackDiff;
		this.minStackSize = minStackSize;
		chanceIngredient = new ChanceFluidIngredient(CTHelper.buildAdditionFluidIngredient(ingredient), chancePercent, stackDiff, minStackSize);
	}
	
	@Override
	public IIngredient getInternalIngredient() {
		return internalIngredient;
	}
	
	@Override
	public int getChancePercent() {
		return chancePercent;
	}
	
	@Override
	public int getStackDiff() {
		return stackDiff;
	}
	
	@Override
	public int getMinStackSize() {
		return minStackSize;
	}
	
	@Override
	public String getMark() {
		return null;
	}
	
	@Override
	public int getAmount() {
		return internalIngredient.getAmount();
	}
	
	@Override
	public List<IItemStack> getItems() {
		return internalIngredient.getItems();
	}
	
	@Override
	public IItemStack[] getItemArray() {
		return internalIngredient.getItemArray();
	}
	
	@Override
	public List<ILiquidStack> getLiquids() {
		return internalIngredient.getLiquids();
	}
	
	@Override
	public IIngredient amount(int amount) {
		return internalIngredient.amount(amount);
	}
	
	@Override
	public IIngredient or(IIngredient ingredient) {
		return internalIngredient.or(ingredient);
	}
	
	@Override
	public IIngredient transformNew(IItemTransformerNew transformer) {
		return internalIngredient.transformNew(transformer);
	}
	
	@Override
	public IIngredient only(IItemCondition condition) {
		return internalIngredient.only(condition);
	}
	
	@Override
	public IIngredient marked(String mark) {
		return null;
	}
	
	@Override
	public boolean matches(IItemStack item) {
		return internalIngredient.matches(item);
	}
	
	@Override
	public boolean matchesExact(IItemStack item) {
		return internalIngredient.matchesExact(item);
	}
	
	@Override
	public boolean matches(ILiquidStack liquid) {
		return internalIngredient.matches(liquid);
	}
	
	@Override
	public boolean contains(IIngredient ingredient) {
		return internalIngredient.contains(ingredient);
	}
	
	@Override
	public IItemStack applyTransform(IItemStack item, IPlayer byPlayer) {
		return internalIngredient.applyTransform(item, byPlayer);
	}
	
	@Override
	public IItemStack applyNewTransform(IItemStack item) {
		return internalIngredient.applyNewTransform(item);
	}
	
	@Override
	public boolean hasNewTransformers() {
		return internalIngredient.hasNewTransformers();
	}
	
	@Override
	public boolean hasTransformers() {
		return internalIngredient.hasTransformers();
	}
	
	@Override
	public IIngredient transform(IItemTransformer transformer) {
		return internalIngredient.transform(transformer);
	}
	
	@Override
	public Object getInternal() {
		return chanceIngredient;
	}
	
	@Override
	public String toCommandString() {
		return chanceIngredient.getIngredientName();
	}
}
