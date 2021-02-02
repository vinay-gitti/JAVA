package JavaFiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;
    
    public News(int newsId, String userPost, String userComment, String comment)
    {
    	this.newsId=newsId;
    	this.postedByUser=userPost;
    	this.commentByUser=userComment;
    	this.comment=comment;
    }
    
    public int getNewsId() 
    {
    	return newsId;
    }
    
	public String getPostedByUser() 
	{
		return postedByUser;
	}
	
	public String getCommentByUser() 
	{
		return commentByUser;
	}
	
	public String getComment() 
	{
		return comment;
	}
}

public class Assignment5Q2 {
    public static int maxComments(List<News> news) {
    	int max=0;
    	int newsId=0;
    	for (News news1: news) {
    		int count=0;
    		for (News news2: news){	
    			if ((news2.getNewsId()) == (news1.getNewsId())){ count++; }	
    			}
    		if(count>max) {
    			max=count;
    			newsId=news1.getNewsId();
    		}
    	}
    	return newsId;
    }

    public static int budgetCount (List < News > news) 
    {
    	int c=0;
    	 for (News n: news) {
    		 c+=countString(n.getComment());
    	 }
    	 return c;
    }
    
    private static int countString(String comment) {
    	String[] arr =comment.split(" ");
    	int count = 0;	
        for (int i = 0; i < arr.length; i++) {
            if ("budget".equals(arr[i])) 
            {
            	count++;
            }
        }
       return count;
	}

	public static String maxCommentsByUser (List < News > news) {
		String str="";
    	int max=0;

    	for (News news1: news) {
    		int count=0;
    		
    		for (News news2: news){	
    			if ((news2.getCommentByUser()).equals(news1.getCommentByUser()))
    			{ 
    				count++; 
    			}	
    		}
    		
    		if(count>max)
    		{ 
    			str=news1.getCommentByUser();  
    			max=count; 
    		}
    	}
    	
    	return str;
	}

    public static Map<String, Integer> sortMaxCommentsByUser (List < News > news) {
    	Map<String,Integer> map=new LinkedHashMap<>();
    	for (News news1: news) {
    		int count=0;
    		
    		for (News news2: news){	
    			if ((news2.getCommentByUser()).equals(news1.getCommentByUser()))
    			{ 
    				count++; 
    			}	
    		}
    		
    		map.put(news1.getCommentByUser(),count);
    	}
	    Map<String,Integer> str = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (i1, i2) -> i2,LinkedHashMap::new));
   
    	return str;
    }

    public static void main(String[] args) {
    	List<News> news = new ArrayList<>();
		Scanner scan= new Scanner(System.in);
		
		System.out.print("enter the number of news items you want to enter: ");
		int n= scan.nextInt();
		
        for(int i=0;i<n;i++) {
	   		 
	   		System.out.print("enter id of news "+(i+1)+": ");
	   		int newsId= scan.nextInt();
	   		 
	   		System.out.print("enter the post by user of news "+(i+1)+": ");
	   		String postByUser= scan.next();
			
			System.out.print("enter the comments by user of news "+(i+1)+": ");
			String userComments= scan.next();
			
			System.out.print("enter comments of news "+(i+1)+": ");
	   	    String comments= scan.next();
	   	     
	   		news.add(new News(newsId,postByUser,userComments,comments));
	   	}
        System.out.println("NewsId with maximum comments: "+maxComments(news));
        System.out.println("Count of 'budget' in user comments: "+budgetCount(news));
        System.out.println("User with maximum comments : "+maxCommentsByUser(news));
        sortMaxCommentsByUser(news).forEach((comments,count)-> System.out.println(comments+"  "+count));
    }
}