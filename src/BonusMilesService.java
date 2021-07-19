public class BonusMilesService {
    public int calculate(int costBilet, int quantityRubForMile) {
        int bonusMile;
        bonusMile = costBilet / quantityRubForMile;
        return bonusMile;
    }

}
