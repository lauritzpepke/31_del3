package game;

public class GUIsamling {
}
    public void GUIField(Field[] fields) {

        desktop_fields.Field[] desktopFields = new desktop_fields.Field[21];

        desktopFields[0] = new desktop_fields.Street.Builder()
                .setTitle(fields[1].getFieldName())
                .setSubText("Price: " + ((Territory) fields[1]).getPrice())
                .setRent("Rent: " + ((Territory) fields[1]).getRent()).setBgColor(Color.green).build();

        desktopFields[1] = new desktop_fields.Street.Builder()
                .setTitle(fields[2].getFieldName())
                .setSubText("Price: " + ((Territory) fields[2]).getPrice())
                .setRent("Rent: " + ((Territory) fields[2]).getRent()).setBgColor(Color.blue).build();

        desktopFields[2] = new desktop_fields.Street.Builder()
                .setTitle(fields[3].getFieldName())
                .setSubText("Price: " + ((Territory) fields[3]).getPrice())
                .setRent("Rent: " + ((Territory) fields[3]).getRent()).setBgColor(Color.red).build();

        desktopFields[3] = new desktop_fields.Street.Builder()
                .setTitle(fields[4].getFieldName())
                .setSubText("Price: " + ((Territory) fields[4]).getPrice())
                .setRent("Rent: " + ((Territory) fields[4]).getRent()).setBgColor(Color.orange).build();

        desktopFields[4] = new desktop_fields.Street.Builder()
                .setTitle(fields[5].getFieldName())
                .setSubText("Price: " + ((Territory) fields[5]).getPrice())
                .setRent("Rent: " + ((Territory) fields[5]).getRent()).setBgColor(Color.yellow).build();

        desktopFields[5] = new desktop_fields.Street.Builder()
                .setTitle(fields[6].getFieldName())
                .setSubText("Price: " + ((Territory) fields[6]).getPrice())
                .setRent("Rent: " + ((Territory) fields[6]).getRent()).setBgColor(Color.lightGray).build();

        desktopFields[6] = new desktop_fields.Street.Builder()
                .setTitle(fields[7].getFieldName())
                .setSubText("Price: " + ((Territory) fields[7]).getPrice())
                .setRent("Rent: " + ((Territory) fields[7]).getRent()).setBgColor(Color.pink).build();

        desktopFields[7] = new desktop_fields.Street.Builder()
                .setTitle(fields[8].getFieldName())
                .setSubText("Price: " + ((Territory) fields[8]).getPrice())
                .setRent("Rent: " + ((Territory) fields[8]).getRent()).setBgColor(Color.magenta).build();

        desktopFields[8] = new desktop_fields.Street.Builder()
                .setTitle(fields[9].getFieldName())
                .setSubText("Price: " + ((Territory) fields[9]).getPrice())
                .setRent("Rent: " + ((Territory) fields[9]).getRent()).setBgColor(Color.cyan).build();

        desktopFields[9] = new desktop_fields.Street.Builder()
                .setTitle(fields[10].getFieldName())
                .setSubText("Price: " + ((Territory) fields[10]).getPrice())
                .setRent("Rent: " + ((Territory) fields[10]).getRent()).setBgColor(Color.darkGray)
                .setFgColor(Color.white).build();

        desktopFields[10] = new desktop_fields.Street.Builder()
                .setTitle(fields[11].getFieldName())
                .setSubText("Price: " + ((Territory) fields[11]).getPrice())
                .setRent("Rent: " + ((Territory) fields[11]).getRent()).setBgColor(Color.RED).build();

        // Refuge

        desktopFields[11] = new desktop_fields.Refuge.Builder()
                .setTitle(fields[12].getFieldName())
                .setSubText("Reward: " + ((Refuge) fields[12]).getBonus()).setBgColor(Color.white)
                .setPicture("images/wcity.png").build();

        desktopFields[12] = new desktop_fields.Refuge.Builder()
                .setTitle(fields[13].getFieldName())
                .setSubText("Reward: " + ((Refuge) fields[13]).getBonus()).setBgColor(Color.BLUE)
                .setFgColor(Color.white).setPicture("images/monastery.png").build();

        // Labor Camp

        desktopFields[13] = new desktop_fields.Street.Builder()
                .setTitle(fields[14].getFieldName())
                .setSubText("Price: " + ((LaborCamp) fields[14]).getPrice())
                .setBgColor(Color.cyan).build();

        desktopFields[14] = new desktop_fields.Street.Builder()
                .setTitle(fields[15].getFieldName())
                .setSubText("Price: " + ((LaborCamp) fields[15]).getPrice())
                .setBgColor(Color.orange).build();

        // Tax
        desktopFields[15] = new desktop_fields.Tax.Builder()
                .setDescription(fields[16].getFieldName())
                .setSubText("Tax: " + ((Tax) fields[16]).getTaxAmount()).setBgColor(Color.red).build();

        desktopFields[16] = new desktop_fields.Tax.Builder()
                .setDescription(fields[17].getFieldName())
                .setSubText("Tax: " + ((Tax) fields[17]).getTaxAmount() + " or 10% of your assets.")
                .setBgColor(Color.yellow).build();

        // Fleets
        desktopFields[17] = new desktop_fields.Street.Builder()
                .setTitle(fields[18].getFieldName())
                .setSubText("Price: " + ((Fleet) fields[18]).getPrice())
                .setBgColor(Color.PINK).build();

        desktopFields[18] = new desktop_fields.Street.Builder()
                .setTitle(fields[19].getFieldName()).setDescription("")
                .setSubText("Price: " + ((Fleet) fields[19]).getPrice())
                .setBgColor(Color.green).build();

        desktopFields[19] = new desktop_fields.Street.Builder()
                .setTitle(fields[20].getFieldName())
                .setSubText("Price: " + ((Fleet) fields[20]).getPrice())
                .setBgColor(Color.red).build();

        desktopFields[20] = new desktop_fields.Street.Builder()
                .setTitle(fields[21].getFieldName())
                .setSubText("Price: " + ((Fleet) fields[21]).getPrice())
                .setBgColor(Color.magenta).build();

        GUI.create(desktopFields);
        GUI.showMessage("Welcome to this game!");

    }

    public Color chooseColor(int NumberOfPlayers) {
        switch (NumberOfPlayers) {
            case 1:
                return Color.BLACK;
            case 2:
                return Color.CYAN;
            case 3:
                return Color.RED;
            case 4:
                return Color.GREEN;
            case 5:
                return Color.YELLOW;
            default:
                return Color.PINK;
        }
    }