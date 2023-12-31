package com.lcefesto.ops;

public class Converter {

        //MEASURE CONSTANTS
        public static final double QUETTA=1000000000000000000000000000000.0;
        public static final double RONNA=1000000000000000000000000000.0;
        public static final double YOTTA=1000000000000000000000000.0;
        public static final double ZETTA=1000000000000000000000.0;
        public static final double EXA=1000000000000000000.0;
        public static final double PETA=1000000000000000.0;
        public static final double TERA=1000000000000.0;
        public static final double GIGA=1000000000;
        public static final double MEGA=1000000;
        public static final double KILO=1000;
        public static final double HECTO=100;
        public static final double DECA=10;
        public static final double DECI=0.1;
        public static final double CENTI=0.01;
        public static final double MILLI=0.001;
        public static final double MICRO=0.000001;
        public static final double NANO=0.000000001;
        public static final double PICO=0.000000000001;
        public static final double FEMTO=0.000000000000001;
        public static final double ATTO=0.000000000000000001;
        public static final double ZEPTO=0.000000000000000000001;
        public static final double YOCTO=0.000000000000000000000001;
        public static final double RONTO=0.000000000000000000000000001;
        public static final double QUECTO=0.000000000000000000000000000001;

        //ACCELERATION CONSTANTS
        public static final double GRAVITY_ACC_MEASURE=0.10197162129779;
        public static final double FOOT_PER_HOUR_PER_SECONDS_MEASURE=1.181102*Math.pow(10.0,4.0);
        public static final double INCH_PER_MINUTE_PER_SECONDS=2362.2049104098;
        public static final double MILE_PER_HOURS_MEASURE=2.237;

        //ANGOLAR ACCELERATION CONSTANTS
        public static final double RADIANT_SECONDS_SQUARED_MEASURE=0.017453;

        //ANGLE CONSTANTS
        public static final double RADIANT_MEASURE=0.017453;
        public static final double GON_MEASURE=1.111;//grado centesimale
        public static final double SECONDS_OF_ARC_MEASURE=3600;

        //BIT & BYTE CONSTANTS
        public static final double BYTE_MEASURE=0.125;

        //DENSITY CONSTANTS
        public static final double OUNCE_PER_CUBIC_FOOT_MEASURE=0.9988;
        public static final double OUNCE_PER_CUBIC_INCH_MEASURE=0.00057804;
        public static final double POUND_PER_CUBIC_FOOT_MEASURE=0.0624;
        public static final double POUND_PER_CUBIC_INCH_MEASURE=3.613 *Math.pow(10.0,-5.0);

        //ENERGY CONSTANTS
        public static final double BRITISH_THERMAL_UNIT_MEASURE=0.00094782;
        public static final double CALORIES_MEASURE=0.238845;
        public static final double ELETTRONVOLT_MEASURE= 6.241506363094*Math.pow(10.0,18.0);
        public static final double FOOT_POUND_FORCE_MEASURE=0.737562;
        public static final double HORSEPOWER_PER_HOUR_MEASURE=3.7243947858473*Math.pow(10.0,-7.0);
        public static final double INCH_POUND_FORCE_MEASURE=8.850745;
        public static final double WATT_HOUR_MEASURE=0.000277777;

        //FORCE CONSTANTS
        public static final double NEWTON_MEASURE=9.80665002864;
        public static final double KILOGRAM_FORCE_MEASURE=0.101972;
        public static final double ATOMIC_UNIT_OF_FORCE_MEASURE=1.21378*Math.pow(10.0,7.0);
        public static final double OUNCE_FORCE_MEASURE=3.596943;
        public static final double POUND_FORCE_MEASURE=0.224808;
        public static final double TON_FORCE_MEASURE=0.000112404;

        //LENGHT CONSTANTS
        public static final double MILE_MEASURE=0.000621371;
        public static final double YARD_MEASURE=1.09361;
        public static final double FOOT_MEASURE=3.28084;
        public static final double INCH_MEASURE=39.3701;
        public static final double NAUMILE_MEASURE=0.000539957;
        public static final double ANGSTROM_MEASURE=10000000000.0;
        public static final double LIGHT_YEAR_MEASURE=1.057*Math.pow(10.0,-16.0);

        //MASS CONSTANTS
        public static final double LONGTON_MEASURE=0.000984207;
        public static final double SHORTTON_MEASURE=0.00110231;
        public static final double STONE_MEASURE=0.157473;
        public static final double POUND_MEASURE=2.20462;
        public static final double OUNCE_MEASURE=35.274;

        //POWER CONSTANTS
        public static final double MECHANICAL_HORSE_POWER_MEASURE=0.001341;
        public static final double BTU_SECOND_MEASURE=0.000947817;
        public static final double CALORIES_SECOND_MEASURE=0.238845;

        //PRESSURE CONSTANTS
        public static final double ATMOSPHERE_MEASURE=9.869*Math.pow(10.0,-6.0);
        public static final double BAR_MEASURE=0.00001;
        public static final double POUND_PER_SQUARED_FOOT_MEASURE=0.020885;
        public static final double POUND_PER_SQUARED_INCH_MEASURE=0.000145037;
        public static final double TORR_MEASURE= 0.007501;

        //SURFACE CONSTANTS
        public static final double CIRCULAR_INCH_MEASURE=1973.525;
        public static final double SQUARED_FOOT_MEASURE=10.763910;
        public static final double SQUARED_INCH_MEASURE=1550;

        //TEMPERATURE CONSTANTS
        public static final double KELVIN_MEASURE=273.15;
        public static final double FAHRENHEIT_MEASURE=32;
        public static final double RANKINE_MEASURE=491.67;

        //TIME CONSTANTS
        public static final double MINUTE_MEASURE=60;
        public static final double HOUR_MEASURE=3600;
        public static final double DAY_MEASURE=86400;
        public static final double WEEK_MEASURE=604800;
        public static final double MONTH_MEASURE=2.628e+6;
        public static final double YEAR_MEASURE=3.154e+7;
        public static final double DECADE_MEASURE=3.154e+8;
        public static final double CENTURY_MEASURE=3.154e+9;

        //SPEED CONSTANTS
        public static final double FEET_PER_SECOND_MEASURE=3.280839;
        public static final double INCH_PER_SECOND_MEASURE= 39.370078;
        public static final double MILE_PER_SECOND_MEASURE=0.000621371;

        //ANGULAR SPEED CONSTANTS
        public static final double RPM_MEASURE=9.549296;
        public static final double DEGREES_PER_SECOND=57.295;
        public static final double HERTZ_MEASURE=0.159154;

        //VOLUME CONSTANTS
        public static final double LITRE_MEASURE=1000;
        public static final double CUBIC_FOOT_MEASURE=35.314666;
        public static final double CUBIC_INCH_MEASURE= 6.102374*Math.pow(10.0,4.0);
        public static final double CUBIC_MILE_MEASURE=2.3991275857893*Math.pow(10.0,-10.0);


        //FUNCTION FOR MEASURE CONSTANTS
        public static double measureToQuetta(double measure){
            return measure/QUETTA;
        }
        public static double measureToRonna(double measure){
            return measure/RONNA;
        }
        public static double measureToYotta(double measure){
            return measure/YOTTA;
        }
        public static double measureToZetta(double measure){
            return measure/ZETTA;
        }
        public static double measureToExa(double measure){
            return measure/EXA;
        }
        public static double measureToPeta(double measure){
            return measure/PETA;
        }
        public static double measureToTera(double measure){
            return measure/TERA;
        }
        public static double measureToGiga(double measure){
            return measure/GIGA;
        }
        public static double measureToMega(double measure){
            return measure/MEGA;
        }
        public static double measureToKilo(double measure){
            return measure/KILO;
        }
        public static double measureToHecto(double measure){
            return measure/HECTO;
        }
        public static double measureToDeca(double measure){
            return measure/DECA;
        }
        public static double measureToDeci(double measure){
            return measure/DECI;
        }
        public static double measureToCenti(double measure){
            return measure/CENTI;
        }
        public static double measureToMilli(double measure){
            return measure/MILLI;
        }
        public static double measureToMicro(double measure){
            return measure/MICRO;
        }
        public static double measureToNano(double measure){
            return measure/NANO;
        }
        public static double measureToPico(double measure){
            return measure/PICO;
        }
        public static double measureToFemto(double measure){
            return measure/FEMTO;
        }
        public static double measureToAtto(double measure){
            return measure/ATTO;
        }
        public static double measureToZepto(double measure){
            return measure/ZEPTO;
        }
        public static double measureToYocto(double measure){
            return measure/YOCTO;
        }
        public static double measureToRonto(double measure){
            return measure/RONTO;
        }
        public static double measureToQuecto(double measure){
            return measure/QUECTO;
        }

        //ACCELERATION
        //UNIT OF MEASURE [m/s^2]
        public static double accMetersToGravityAcc(double measure){
            return measure*GRAVITY_ACC_MEASURE;
        }
        public static double accMetersToFPHS(double measure){
            return measure*FOOT_PER_HOUR_PER_SECONDS_MEASURE;
        }
        public static double accMetersToIPMS(double measure){
            return measure*INCH_PER_MINUTE_PER_SECONDS;
        }
        public static double accMetersToMilePerHour(double measure){
            return measure*MILE_PER_HOURS_MEASURE;
        }
        public static double gravityAccToAccMeters(double measure){
            return measure/GRAVITY_ACC_MEASURE;
        }
        public static double FPHSToAccMeters(double measure){
            return measure/FOOT_PER_HOUR_PER_SECONDS_MEASURE;
        }
        public static double IPMSToAccMeters(double measure){
            return measure/INCH_PER_MINUTE_PER_SECONDS;
        }
        public static double milePerHourToAccMeters(double measure){
            return measure/MILE_PER_HOURS_MEASURE;
        }

        //ANGULAR ACCELERATION
        //UNIT OF MEASURE [Grad/s^2]
        public static double gradSecondSquaredToRadSecondSquared(double measure){
            return measure*RADIANT_SECONDS_SQUARED_MEASURE;
        }
        public static double radSecondSquaredToGradSecondSquared(double measure){
            return measure/RADIANT_SECONDS_SQUARED_MEASURE;
        }

        //ANGLE
        //UNIT OF MEASURE [Grad°]
        public static double gradToRad(double measure){
            return measure*RADIANT_MEASURE;
        }
        public static double gradtoGon(double measure){
            return measure*GON_MEASURE;
        }
        public static double gradToSecondOfArc(double measure){
            return measure*SECONDS_OF_ARC_MEASURE;
        }
        public static double radToGrad(double measure){
            return measure/RADIANT_MEASURE;
        }
        public static double gonToGrad(double measure){
            return measure/GON_MEASURE;
        }
        public static double secondOfArcToGrad(double measure){
            return measure/SECONDS_OF_ARC_MEASURE;
        }

        //BIT & BYTES
        public static double bitToByte(double measure){
            return measure*BYTE_MEASURE;
        }
        public static double byteToBit(double measure){
            return measure/BYTE_MEASURE;
        }

        //DENSITY
        //UNIT OF MEASURE [kg/m^3]
        public static double kiloCubicMetersToOuncePerCubicFoot(double measure){
            return measure*OUNCE_PER_CUBIC_FOOT_MEASURE;
        }
        public static double kiloCubicMetersToOuncePerCubicInch(double measure){
            return measure*OUNCE_PER_CUBIC_INCH_MEASURE;
        }
        public static double kiloCubicMetersToPoundPerCubicFoot(double measure){
            return measure*POUND_PER_CUBIC_FOOT_MEASURE;
        }
        public static double kiloCubicMetersToPoundPerCubicInch(double measure){
            return measure*POUND_PER_CUBIC_INCH_MEASURE;
        }
        public static double ouncePerCubicFootToKiloCubicMeters(double measure){
            return measure/OUNCE_PER_CUBIC_FOOT_MEASURE;
        }
        public static double ouncePerCubicInchToKiloCubicMeters(double measure){
            return measure/OUNCE_PER_CUBIC_INCH_MEASURE;
        }
        public static double poundPerCubicFootToKiloCubicMeters(double measure){
            return measure/POUND_PER_CUBIC_FOOT_MEASURE;
        }
        public static double poundPerCubicInchToKiloCubicMeters(double measure){
            return measure/POUND_PER_CUBIC_INCH_MEASURE;
        }

        //ENERGY
        //UNIT OF MEASURE [J]
        public static double jouleToBritishThermalUnit(double measure){
            return measure*BRITISH_THERMAL_UNIT_MEASURE;
        }
        public static double jouleToCalories(double measure){
            return measure*CALORIES_MEASURE;
        }
        public static double jouleToElettronVolt(double measure){
            return measure*ELETTRONVOLT_MEASURE;
        }
        public static double jouleToFootPoundForce(double measure){
            return measure*FOOT_POUND_FORCE_MEASURE;
        }
        public static double jouleToHorsepowerPerHour(double measure){
            return measure*HORSEPOWER_PER_HOUR_MEASURE;
        }
        public static double jouleToInchPoundForce(double measure){
            return measure*INCH_POUND_FORCE_MEASURE;
        }
        public static double jouleToWattHour(double measure){
            return measure*WATT_HOUR_MEASURE;
        }
        public static double britishThermalUnitToJoule(double measure){
            return measure/BRITISH_THERMAL_UNIT_MEASURE;
        }
        public static double caloriesToJoule(double measure){
            return measure/CALORIES_MEASURE;
        }
        public static double elettronVoltToJoule(double measure){
            return measure/ELETTRONVOLT_MEASURE;
        }
        public static double footPoundForceToJoule(double measure){
            return measure/FOOT_POUND_FORCE_MEASURE;
        }
        public static double horsepowerPerHourToJoule(double measure){
            return measure/HORSEPOWER_PER_HOUR_MEASURE;
        }
        public static double inchPoundForceToJoule(double measure){
            return measure/INCH_POUND_FORCE_MEASURE;
        }
        public static double wattHourToJoule(double measure){
            return measure/WATT_HOUR_MEASURE;
        }

        //FORCE
        //UNIT OF MEASURE [N]
        public static double newtonToKilograms(double measure){
            return measure/NEWTON_MEASURE;
        }
        public static double newtonToKilogramForce(double measure){
            return measure*KILOGRAM_FORCE_MEASURE;
        }
        public static double newtonToAtomicUnitOfForce(double measure){
            return measure*ATOMIC_UNIT_OF_FORCE_MEASURE;
        }
        public static double newtonToOunceForce(double measure){
            return measure*OUNCE_FORCE_MEASURE;
        }
        public static double newtonToPoundForce(double measure){
            return measure*POUND_FORCE_MEASURE;
        }
        public static double newtonToTonForce(double measure){
            return measure*TON_FORCE_MEASURE;
        }
        public static double kilogramForceToNewton(double measure){
            return measure/KILOGRAM_FORCE_MEASURE;
        }
        public static double atomicUnitOfForceToNewton(double measure){
            return measure/ATOMIC_UNIT_OF_FORCE_MEASURE;
        }
        public static double ounceForceToNewton(double measure){
            return measure/OUNCE_FORCE_MEASURE;
        }
        public static double poundForceToNewton(double measure){
            return measure/POUND_FORCE_MEASURE;
        }
        public static double tonForceToNewton(double measure){
            return measure/TON_FORCE_MEASURE;
        }

        //FREQUENCE
        //UNIT OF MEASURE [Hz]
        public static double hertzToSeconds(double measure){
            return 1.0/measure;
        }
        public static double hertzToRPM(double measure){
            return measure*MINUTE_MEASURE;
        }
        public static double secondsToHertz(double measure){
            return 1.0/measure;
        }
        public static double RPMToHertz(double measure){
            return measure/MINUTE_MEASURE;
        }


        //LENGHT:
        //UNIT OF MEASURE : meters [m]
        public static double metersToMile(double measure){
            return measure*MILE_MEASURE;
        }
        public static double metersToYard(double measure){
            return measure*YARD_MEASURE;
        }
        public static double metersToFoot(double measure){
            return measure*FOOT_MEASURE;
        }
        public static double metersToInch(double measure){
            return measure*INCH_MEASURE;
        }
        public static double metersToNauticalMile(double measure){
            return measure*NAUMILE_MEASURE;
        }
        public static double metersToAngstrom(double measure){
            return measure*ANGSTROM_MEASURE;
        }
        public static double metersToLightYear(double measure){
            return measure*LIGHT_YEAR_MEASURE;
        }
        public static double mileToMeters(double measure){
            return measure/MILE_MEASURE;
        }
        public static double yardToMeters(double measure){
            return measure/YARD_MEASURE;
        }
        public static double footToMeters(double measure){
            return measure/FOOT_MEASURE;
        }
        public static double inchToMeters(double measure){
            return measure/INCH_MEASURE;
        }
        public static double nauticalMileToMeters(double measure){
            return measure*NAUMILE_MEASURE;
        }
        public static double angstromToMeters(double measure){
            return measure/ANGSTROM_MEASURE;
        }
        public static double lightYearToMeters(double measure){
            return measure/LIGHT_YEAR_MEASURE;
        }

        //MASS
        //UNIT OF MEASURE : [kg]
        public static double kilogramToMetricTon(double measure){
            return measure/KILO;
        }
        public static double kilogramToLongTon(double measure){
            return measure*LONGTON_MEASURE;
        }
        public static double kilogramToShortTon(double measure){
            return measure*SHORTTON_MEASURE;
        }
        public static double kilogramToStone(double measure){
            return measure*STONE_MEASURE;
        }
        public static double kilogramToPound(double measure){
            return measure*POUND_MEASURE;
        }
        public static double kilogramToOunce(double measure){
            return measure*OUNCE_MEASURE;
        }
        public static double kilogramToNewton(double measure){
            return measure*NEWTON_MEASURE;
        }
        public static double metricTonToKilogram(double measure){
            return measure*KILO;
        }
        public static double longTonToKilogram(double measure){
            return measure/LONGTON_MEASURE;
        }
        public static double shortTonToKilogram(double measure){
            return measure/SHORTTON_MEASURE;
        }
        public static double stoneToKilogram(double measure){
            return measure/STONE_MEASURE;
        }
        public static double poundToKilogram(double measure){
            return measure/POUND_MEASURE;
        }
        public static double ounceToKilogram(double measure){
            return measure/OUNCE_MEASURE;
        }


        //PARTS-PER
        //UNIT OF MEASURE [%]
        public static double percentToPerThousand(double measure){
            return measure*DECA;
        }
        public static double percentToPartsPerMillion(double measure){
            return measure*DECA*KILO;
        }
        public static double percentToPartsPerBillion(double measure){
            return measure*DECA*MEGA;
        }
        public static double perThousandToPercent(double measure){
            return measure/DECA;
        }
        public static double partsPerMillionToPercent(double measure){
            return measure/(DECA*KILO);
        }
        public static double partsPerBillionToPercent(double measure){
            return measure/(DECA*MEGA);
        }

        //POWER
        //UNIT OF MEASURE [W]
        public static double wattToMechanicalHorsePower(double measure){
            return measure*MECHANICAL_HORSE_POWER_MEASURE;
        }
        public static double wattToBTUPerMinutes(double measure){
            return measure*BTU_SECOND_MEASURE;
        }
        public static double wattToCaloriesSecond(double measure){
            return measure*CALORIES_SECOND_MEASURE;
        }
        public static double mechanicalHorsePowerToWatt(double measure){
            return measure/MECHANICAL_HORSE_POWER_MEASURE;
        }
        public static double BTUPerMinutesToWatt(double measure){
            return measure/BTU_SECOND_MEASURE;
        }
        public static double caloriesSecondToWatt(double measure){
            return measure/CALORIES_SECOND_MEASURE;
        }

        //PRESSURE
        //UNIT OF MEASURE [Pascal]
        public static double pascalToAtmosphere(double measure){
            return measure*ATMOSPHERE_MEASURE;
        }
        public static double pascalToBar(double measure){
            return measure*BAR_MEASURE;
        }
        public static double pascalToPoundPerSquaredFoot(double measure){
            return measure*POUND_PER_SQUARED_FOOT_MEASURE;
        }
        public static double pascalToPoundPerSquaredInch(double measure){
            return measure*POUND_PER_SQUARED_INCH_MEASURE;
        }
        public static double pascalToTorr(double measure){
            return measure*TORR_MEASURE;
        }
        public static double atmosphereToPascal(double measure){
            return measure/ATMOSPHERE_MEASURE;
        }
        public static double barToPascal(double measure){
            return measure/BAR_MEASURE;
        }
        public static double poundPerSquaredFootToPascal(double measure){
            return measure/POUND_PER_SQUARED_FOOT_MEASURE;
        }
        public static double poundPerSquaredInchToPascal(double measure){
            return measure/POUND_PER_SQUARED_INCH_MEASURE;
        }
        public static double torrToPascal(double measure){
            return measure/TORR_MEASURE;
        }

        //SURFACE
        //UNIT OF MEASURE [m^2]
        public static double squaredMetersToCircularInch(double measure){
            return measure*CIRCULAR_INCH_MEASURE;
        }
        public static double squaredMetersToSquaredFoot(double measure){
            return measure*SQUARED_FOOT_MEASURE;
        }
        public static double squaredMetersToSquaredInch(double measure){
            return measure*SQUARED_INCH_MEASURE;
        }
        public static double circularInchToSquaredMeters(double measure){
            return measure/CIRCULAR_INCH_MEASURE;
        }
        public static double squaredFootToSquaredMeters(double measure){
            return measure/SQUARED_FOOT_MEASURE;
        }
        public static double squaredInchToSquaredMeters(double measure){
            return measure/SQUARED_INCH_MEASURE;
        }

        //TEMPERATURE
        //UNIT OF MEASURE [°C]
        public static double celsiusToKelvin(double measure){
            return measure+KELVIN_MEASURE;
        }
        public static double celsiusToFahrenheit(double measure){
            return measure+FAHRENHEIT_MEASURE;
        }
        public static double celsiusToRankine(double measure){
            return measure+RANKINE_MEASURE;
        }
        public static double kelvinToCelsius(double measure){
            return measure-KELVIN_MEASURE;
        }
        public static double fahrenheitToCelsius(double measure){
            return measure-FAHRENHEIT_MEASURE;
        }
        public static double rankineToCelsius(double measure){
            return measure-RANKINE_MEASURE;
        }

        //TIME
        //UNIT OF MEASURE [s]
        public static double secondsToMinutes(double measure){
            return measure/MINUTE_MEASURE;
        }
        public static double secondsToHours(double measure){
            return measure/HOUR_MEASURE;
        }
        public static double secondsToDays(double measure){
            return measure/DAY_MEASURE;
        }
        public static double secondsToWeeks(double measure){
            return measure/WEEK_MEASURE;
        }
        public static double secondsToMonths(double measure){
            return measure/MONTH_MEASURE;
        }
        public static double secondsToYears(double measure){
            return measure/YEAR_MEASURE;
        }
        public static double secondsToDecades(double measure){
            return measure/DECADE_MEASURE;
        }
        public static double secondsToCenturies(double measure){
            return measure/CENTURY_MEASURE;
        }
        public static double minutesToSeconds(double measure){
            return measure*MINUTE_MEASURE;
        }
        public static double hoursToSeconds(double measure){
            return measure*HOUR_MEASURE;
        }
        public static double daysToSeconds(double measure){
            return measure*DAY_MEASURE;
        }
        public static double weekToSeconds(double measure){
            return measure*WEEK_MEASURE;
        }
        public static double monthsToSeconds(double measure){
            return measure*MONTH_MEASURE;
        }
        public static double yearsToSeconds(double measure){
            return measure*YEAR_MEASURE;
        }
        public static double decadesToSeconds(double measure){
            return measure*DECADE_MEASURE;
        }
        public static double centuriesToSeconds(double measure){
            return measure*CENTURY_MEASURE;
        }

        //SPEED
        //UNIT OF MEASURE [m/s]
        public static double metersPerSecondToFeetPerSecond(double measure){
            return measure*FEET_PER_SECOND_MEASURE;
        }
        public static double metersPerSecondToInchPerSecond(double measure){
            return measure*INCH_PER_SECOND_MEASURE;
        }
        public static double metersPerSecondToMilePerSecond(double measure){
            return measure*MILE_PER_SECOND_MEASURE;
        }
        public static double feetPerSecondToMetersPerSecond(double measure){
            return measure/FEET_PER_SECOND_MEASURE;
        }
        public static double inchPerSecondToMetersPerSecond(double measure){
            return measure/INCH_PER_SECOND_MEASURE;
        }
        public static double milePerSecondToMetersPerSecond(double measure){
            return measure/MILE_PER_SECOND_MEASURE;
        }

        //ANGULAR SPEED
        //UNIT OF MEASURE [rad/s]
        public static double radiansPerSecondToRPM(double measure){
            return measure*RPM_MEASURE;
        }
        public static double radiansPerSecondToDegreesPerSecond(double measure){
            return measure*DEGREES_PER_SECOND;
        }
        public static double radiansPerSecondToHertz(double measure){
            return measure*HERTZ_MEASURE;
        }
        public static double RPMToRadiansPerSecond(double measure){
            return measure/RPM_MEASURE;
        }
        public static double degreesPerSecondToRadiansPerSecond(double measure){
            return measure/DEGREES_PER_SECOND;
        }
        public static double hertzToRadiansPerSecond(double measure){
            return measure/HERTZ_MEASURE;
        }

        //VOLUME
        //UNIT OF MEASURE [m^3]
        public static double cubicMetersToLitre(double measure){
            return measure*LITRE_MEASURE;
        }
        public static double cubicMetersToCubicFoot(double measure){
            return measure*CUBIC_FOOT_MEASURE;
        }
        public static double cubicMetersToCubicInch(double measure){
            return measure*CUBIC_INCH_MEASURE;
        }
        public static double cubicMetersToCubicMile(double measure){
            return measure*CUBIC_MILE_MEASURE;
        }
        public static double litreToCubicMeters(double measure){
            return measure/LITRE_MEASURE;
        }
        public static double cubicFootToCubicMeters(double measure){
            return measure/CUBIC_FOOT_MEASURE;
        }
        public static double cubicInchToCubicMeters(double measure){
            return measure/CUBIC_INCH_MEASURE;
        }
        public static double cubicMileToCubicMeters(double measure){
            return measure/CUBIC_MILE_MEASURE;
        }

}
