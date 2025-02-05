object ScalaContainsDuplicate{
    def containsDuplicate(nums: Array[Int]): Boolean = {
        var numset : Set[Int] = Set()
        for (i <- 0 to (nums.length-1)) {
            if (numset.contains(nums(i))){
                return true
            }
            numset+=nums(i)
        }
        return false
    }

    def main(args: Array[String]) = {
         var nums = Array(7,1,5,3,3,6,4)
         print(containsDuplicate(nums))
    }
}