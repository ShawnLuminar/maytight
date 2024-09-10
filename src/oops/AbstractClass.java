package oops;

abstract class Google {
    abstract void display();
    
    public void search() {
        System.out.println("Search Details");
    }
}

class SearchAll extends Google {
    void display() {
        System.out.println("Search Home Details");
    }
}

class SearchImage extends Google {
    void display() {
        System.out.println("Search Image Details");
    }
}

class SearchVideo extends Google {
    void display() {
        System.out.println("Search Video Details");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        SearchAll s1 = new SearchAll();
        s1.search();
        s1.display();
        
        SearchImage s2 = new SearchImage();
        s2.search();
        s2.display();
        
        SearchVideo s3 = new SearchVideo();
        s3.search();
        s3.display();
    }
}

