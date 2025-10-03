class Cat (val name: String, var age: Int, var weight: Int) {

    public fun walk(distance: Int) : Boolean
    {
        if(weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }

    fun eat(amount: Int) {
        if(weight+amount>20)
            weight=0

        else{
            weight += amount
        }
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}