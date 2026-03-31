class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // Initializes the first row is [1].

        for (int i = 0; i < rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1); // First element is always 1.
            for (int j = 1; j < row.size(); j++) { //Loop skipping the first & the last element.
                newRow.add(row.get(j - 1) + row.get(j));
            }
            newRow.add(1); //Last element is always 1.
            row = newRow;
        }

        return row;
    }
}
