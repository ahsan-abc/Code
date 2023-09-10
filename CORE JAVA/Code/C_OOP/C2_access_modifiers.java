/*
How a member can be accessed is determined by the access modifier attached to its declaration.
Usually, you will want to restrict access to the data members of a class—allowing access only through methods.
Also, there will be times when you will want to define methods that are private to a class.

Java’s access modifiers are public, private, and protected. Java also defines a default access level.
protected applies only when inheritance is involved.

When no access modifier is used, then by default the member of a class is public within its own package,
but cannot be accessed outside of its package.

            │ Class │ Package │ Subclass │ Subclass │ World
            │       │         │(same pkg)│(diff pkg)│(diff pkg & not subclass)
────────────┼───────┼─────────┼──────────┼──────────┼──────────────────────────
public      │   Y   │    Y    │    Y     │     Y    │   Y
────────────┼───────┼─────────┼──────────┼──────────┼──────────────────────────
protected   │   Y   │    Y    │    Y     │     Y    │   N
────────────┼───────┼─────────┼──────────┼──────────┼──────────────────────────
no modifier │   Y   │    Y    │    Y     │     N    │   N
────────────┼───────┼─────────┼──────────┼──────────┼──────────────────────────
private     │   Y   │    N    │    N     │     N    │   N

Y : accessible
N : not accessible
 */

public class C2_access_modifiers
{
   
   public static void main (String [] args)
   {
    

   }


}