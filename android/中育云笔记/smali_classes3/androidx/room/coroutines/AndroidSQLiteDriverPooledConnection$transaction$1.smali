.class final Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection$transaction$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;->transaction(Landroidx/room/Transactor$SQLiteTransactionType;Lhd/p;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.room.coroutines.AndroidSQLiteDriverPooledConnection"
    f = "AndroidSQLiteDriverConnectionPool.android.kt"
    l = {
        0x57
    }
    m = "transaction"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;


# direct methods
.method public constructor <init>(Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;",
            "Lvc/c<",
            "-",
            "Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection$transaction$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection$transaction$1;->this$0:Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection$transaction$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection$transaction$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection$transaction$1;->label:I

    iget-object p1, p0, Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection$transaction$1;->this$0:Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;->access$transaction(Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;Landroidx/room/Transactor$SQLiteTransactionType;Lhd/p;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
