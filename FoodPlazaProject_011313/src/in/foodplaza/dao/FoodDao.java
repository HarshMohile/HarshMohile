package in.foodplaza.dao;

import java.util.List;

import in.foodplaza.pojo.Food;

interface FoodDao {

	public boolean addFood(Food food);

	public boolean updateFood(Food food);

	public boolean deleteFood(int foodId);

	public List<Food> ShowFoodList();

	public Food SearchFoodByFoodid(int foodId);

	public List<Food> SearchFoodByFoodName(String foodName);

	public List<Food> SearchFoodByType(String foodType);

	public List<Food> SearchFoodByCategory(String foodCategory);

}
