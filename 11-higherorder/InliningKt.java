package princeoprince;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 5, 1},
   k = 2,
   xi = 48,
   d1 = {"\u0000\u001c\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0006\u0010\b\u001a\u00020\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"},
   d2 = {"first", "T", "items", "", "predicate", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "main", "", "11-higherorder"}
)
public final class InliningKt {
   public static final void main() {
      Integer[] var1 = new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5)};
      List ints = CollectionsKt.listOf(var1);
      int $i$f$first = false;
      Iterator var3 = ints.iterator();

      Object item$iv;
      int i;
      do {
         if(!var3.hasNext()) {
            throw new Exception();
         }

         item$iv = var3.next();
         i = ((Number)item$iv).intValue();
         int var6 = false;
      } while(i != 3);

      int i = ((Number)item$iv).intValue();
      $i$f$first = false;
      System.out.println(i);
   }

   public static final Object first(@NotNull List items, @NotNull Function1 predicate) {
      Intrinsics.checkNotNullParameter(items, "items");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int $i$f$first = false;
      Iterator var3 = items.iterator();

      Object item;
      do {
         if(!var3.hasNext()) {
            throw new Exception();
         }

         item = var3.next();
      } while(!((Boolean)predicate.invoke(item)).booleanValue());

      return item;
   }

   // $FF: synthetic method
   public static void main(String[] args) {
      main();
   }
}
