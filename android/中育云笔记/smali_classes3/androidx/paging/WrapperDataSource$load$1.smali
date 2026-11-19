.class final Landroidx/paging/WrapperDataSource$load$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/WrapperDataSource;->load$suspendImpl(Landroidx/paging/WrapperDataSource;Landroidx/paging/DataSource$Params;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Key:",
        "Ljava/lang/Object;",
        "ValueFrom:",
        "Ljava/lang/Object;",
        "ValueTo:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.paging.WrapperDataSource"
    f = "WrapperDataSource.jvmAndAndroid.kt"
    l = {
        0x48
    }
    m = "load$suspendImpl"
    v = 0x1
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/paging/WrapperDataSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/WrapperDataSource<",
            "TKey;TValueFrom;TValueTo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/paging/WrapperDataSource;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/WrapperDataSource<",
            "TKey;TValueFrom;TValueTo;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/WrapperDataSource$load$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/WrapperDataSource$load$1;->this$0:Landroidx/paging/WrapperDataSource;

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

    iput-object p1, p0, Landroidx/paging/WrapperDataSource$load$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/paging/WrapperDataSource$load$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/paging/WrapperDataSource$load$1;->label:I

    iget-object p1, p0, Landroidx/paging/WrapperDataSource$load$1;->this$0:Landroidx/paging/WrapperDataSource;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Landroidx/paging/WrapperDataSource;->load$suspendImpl(Landroidx/paging/WrapperDataSource;Landroidx/paging/DataSource$Params;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
