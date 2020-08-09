package com.brizaldi.dicodingandroid1.model

/*
 * DicodingPemula
 * CocktailData
 * Created by Bahri Rizaldi on 09/08/2020 15:18
 *
 */

object CocktailData {
    private var data = arrayOf(
        arrayOf(
            "Mojito",
            "https://www.thecocktaildb.com/images/media/drink/3z6xdi1589574603.jpg",
            "• 2-3 oz Light rum\n" +
                    "• Juice of 1 Lime\n" +
                    "• 2 tsp Sugar\n" +
                    "• 2-4 Mint\n" +
                    "• Soda water",
            "Muddle mint leaves with sugar and lime juice.\n" +
                    "Add a splash of soda water and fill the glass with cracked ice.\n" +
                    "Pour the rum and top with soda water.\n" +
                    "Garnish and serve with straw."
        ),
        arrayOf(
            "Old Fashioned",
            "https://www.thecocktaildb.com/images/media/drink/vrwquq1478252802.jpg",
            "• 4.5 cL Bourbon\n" +
                    "• 2 dashes Angostura bitters\n" +
                    "• 1 cube Sugar\n" +
                    "• dash Water",
            "Place sugar cube in old fashioned glass and saturate with bitters, add a dash of plain water.\n" +
                    "Muddle until dissolved.\n" +
                    "Fill the glass with ice cubes and add whiskey.\n" +
                    "Garnish with orange twist, and a cocktail cherry."
        ),
        arrayOf(
            "Long Island Tea",
            "https://www.thecocktaildb.com/images/media/drink/tppn6i1589574695.jpg",
            "• 1/2 oz Vodka\n" +
                    "• 1/2 oz Light rum\n" +
                    "• 1/2 oz Gin\n" +
                    "• 1/2 oz Tequila\n" +
                    "• Juice of 1/2 Lemon\n" +
                    "• 1 splash Coca-Cola",
            "Combine all ingredients (except cola) and pour over ice in a highball glass.\n" +
                    "Add the splash of cola for color.\n" +
                    "Decorate with a slice of lemon and serve."
        ),
        arrayOf(
            "Negroni",
            "https://www.thecocktaildb.com/images/media/drink/qgdu971561574065.jpg",
            "• 1 oz Gin\n" +
                    "• 1 oz Campari\n" +
                    "• 1 oz Sweet Vermouth",
            "Stir into glass over ice, garnish and serve."
        ),
        arrayOf(
            "Whiskey Sour",
            "https://www.thecocktaildb.com/images/media/drink/hbkfsh1589574990.jpg",
            "• 2 oz Blended whiskey\n" +
                    "• Juice of 1/2 Lemon\n" +
                    "• 1/2 tsp Powdered sugar\n" +
                    "• 1 Cherry\n" +
                    "• 1/2 slice Lemon",
            "Shake with ice.\n" +
                    "Strain into chilled glass, garnish and serve.\n" +
                    "If served 'On the rocks', strain ingredients into old-fashioned glass filled with ice."
        ),
        arrayOf(
            "Dry Martini",
            "https://www.thecocktaildb.com/images/media/drink/6ck9yi1589574317.jpg",
            "• 1 2/3 oz Gin\n" +
                    "• 1/3 oz Dry Vermouth\n" +
                    "• 1 Olive",
            "Straight: Pour all ingredients into mixing glass with ice cubes.\n" +
                    "Stir well.\n" +
                    "Strain in chilled martini cocktail glass.\n" +
                    "Squeeze oil from lemon peel onto the drink, or garnish with olive."
        ),
        arrayOf(
            "Daiquiri",
            "https://www.thecocktaildb.com/images/media/drink/mrz9091589574515.jpg",
            "• 1 1/2 oz Light rum\n" +
                    "• Juice of 1/2 Lime\n" +
                    "• 1 tsp Powdered sugar",
            "Pour all ingredients into shaker with ice cubes.\n" +
                    "Shake well.\n" +
                    "Strain in chilled cocktail glass.\n"
        ),
        arrayOf(
            "Margarita",
            "https://www.thecocktaildb.com/images/media/drink/mrz9091589574515.jpg",
            "• 1 1/2 oz Tequila\n" +
                    "• 1/2 oz Triple sec\n" +
                    "• 1 oz Lime juice\n" +
                    "• Salt",
            "Rub the rim of the glass with the lime slice to make the salt stick to it.\n" +
                    "Take care to moisten only the outer rim and sprinkle the salt on it.\n" +
                    "The salt should present to the lips of the imbiber and never mix into the cocktail.\n" +
                    "Shake the other ingredients with ice, then carefully pour into the glass."
        ),
        arrayOf(
            "Manhattan",
            "https://www.thecocktaildb.com/images/media/drink/hz7p4t1589575281.jpg",
            "• 3/4 oz Sweet Vermouth\n" +
                    "• 2 1/2 oz Blended Bourbon\n" +
                    "• dash Angostura bitters\n" +
                    "• 2 or 3 Ice\n" +
                    "• 1 Maraschino cherry\n" +
                    "• 1 twist of Orange peel",
            "Stirred over ice, strained into a chilled glass, garnished, and served up."
        ),
        arrayOf(
            "Moscow Mule",
            "https://www.thecocktaildb.com/images/media/drink/3pylqc1504370988.jpg",
            "• 2 oz Vodka\n" +
                    "• 2 oz Lime juice\n" +
                    "• 8 oz Ginger ale",
            "Combine vodka and ginger beer in a highball glass filled with ice.\n" +
                    "Add lime juice.\n" +
                    "Stir gently.\n" +
                    "Garnish."
        )
    )

    val cocktailListData: ArrayList<Cocktail>
        get() {
            val list = ArrayList<Cocktail>()
            for (aData in data) {
                val cocktail = Cocktail()
                cocktail.name = aData[0]
                cocktail.image = aData[1]
                cocktail.ingredients = aData[2]
                cocktail.instructions = aData[3]

                list.add(cocktail)
            }
            return list
        }
}