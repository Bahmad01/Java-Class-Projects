class RunnerClient {
        public static void main(String[] args) {
                Runner r1 = new Runner("Bikila", 2, 15, 16);
                System.out.println(r1.getName()+" Time in Seconds: "+r1.getSeconds()+" Percentage Slower: "+r1.percentageSlower());

                Runner r3 = new Runner("Radcliffe", "2:15:25");
                System.out.println(r3.getName()+" Time in Seconds: "+r3.getSeconds()+" Percentage Slower: "+r3.percentageSlower());
                
                Runner r4 = new Runner("Gomez", "4:29:54");
                System.out.println(r4.getName()+" Time in Seconds: "+r4.getSeconds()+" Percentage Slower: "+r4.percentageSlower());
                
                Runner r5 = new Runner("Ifrah", "3:32:00");
                System.out.println(r5.getName()+" Time in Seconds: "+r5.getSeconds()+" Percentage Slower: "+r5.percentageSlower());

                // add code here to test more

        }
}


