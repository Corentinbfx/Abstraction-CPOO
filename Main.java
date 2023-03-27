public class Main {
    public static void main(String[] args) {
        //Création d'une collection de collection vide
        CollectionPierres collection = new CollectionPierres();
        //Remplissage de la collection avec différentes pierres
        collection.addPierre(new PierrePrecieuse("Saphir Bleu", "Saphir", "A"));
        collection.addPierre(new PierrePrecieuse("Diamant Rouge", "Diamant", "AA"));
        collection.addPierre(new PierrePrecieuse("Emeraude Verte", "Emeraude", "AAA"));
        collection.addPierre(new PierrePrecieuse("Diamant VVS", "Diamant", "A"));


        System.out.println("=== Affichage de Toutes les Pierres de la Collection ===");
        //TODO: Afficher, en utilisant une boucle foreach, la liste des Pierres Precieuses contenues dans collection (la CollectionPierre créée et remplie ci-dessus)


        System.out.println("=== Affichage des Diamants Uniquement ===");
        //TODO: Afficher, sans utiliser de boucle foreach mais en utilisant un itérateur,
        //      la liste des Pierres Precieuses de type Diamant dans collection (la CollectionPierre créée et remplie ci-dessus)


        System.out.println("=== Affichage des Emeraudes Uniquement ===");
        //TODO: Afficher, sans utiliser de boucle foreach mais en utilisant un itérateur,
        //      la liste des Pierres Precieuses de type Emeraude dans collection (la CollectionPierre créée et remplie ci-dessus)

    }
}