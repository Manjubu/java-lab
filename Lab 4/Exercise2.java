abstract class Item
{
 
private int idNo;
private String title;
private int noOfCopies;

Item(int idNo,String title,int noOfCopies)
{
this.idNo=idNo;
this.title=title;
this.noOfCopies=noOfCopies;
}

public int getIdno()
{
 return idNo;
}
public String getTitle()
{
return title;
}
public int getNoCopies()
{
return noOfCopies;
}

public void setIdno(int id)
{
idNo=id;
}
public void setTitle(String t)
{
title=t;
}
public void setNoCopies(int n)
{
noOfCopies=n;
}

@Override
public String toString()
{
return "idNo="+idNo+"title="+title+"noOfCopies="+noOfCopies;
}

@Override
public int hashCode()
{
 return Objects.hash(idNo,title,noOfCopies);
}

@Override
public boolean equals(Object obj)
if (this ==obj)
return true;
if (obj ==null)
return false;
if (getClass() !=obj.getClass())
return false;
Item other=(Item) obj;
return Objects.equals(idNo == other.idNo) && Objects.equals(title, other.title) && Objects.equals(noOfCopies, other.noOfCopies);
}

public void addItem(int id,String t,int n)
{
setIdNo(int id);
setTitle(t);
setNoOfCopies(n);
}
}

abstract class WrittenItem extends Item
{
 private String author;
}

class Book extends WrittenItem
{

}

class JournalPaper extends Written Item
{
private int yearPublish;
}

abstract class MediaItem extends Item
{
private int data;
}

class Video extends MediaItem
{
private String director;
private String genre;
private int yearRelease;
}

class CD extends MediaItem
{
private String artist;
private String genre;
}


