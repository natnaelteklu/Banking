import PowerApp.PowerCalculatorPOA;

public class PowerCalculatorImpl extends PowerCalculatorPOA {
    @Override
    public float power(float base, float exponent) {
        return (float) Math.pow(base, exponent);
    }
}