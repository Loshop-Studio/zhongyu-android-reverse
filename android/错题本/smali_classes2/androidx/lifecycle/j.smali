.class public final synthetic Landroidx/lifecycle/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/lifecycle/MediatorLiveData;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/MediatorLiveData;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/lifecycle/j;->a:I

    iput-object p1, p0, Landroidx/lifecycle/j;->b:Landroidx/lifecycle/MediatorLiveData;

    iput-object p2, p0, Landroidx/lifecycle/j;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/j;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/lifecycle/j;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/arch/core/util/Function;

    iget-object v1, p0, Landroidx/lifecycle/j;->b:Landroidx/lifecycle/MediatorLiveData;

    invoke-static {v1, v0, p1}, Landroidx/lifecycle/Transformations;->b(Landroidx/lifecycle/MediatorLiveData;Landroidx/arch/core/util/Function;Ljava/lang/Object;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/lifecycle/j;->c:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v1, p0, Landroidx/lifecycle/j;->b:Landroidx/lifecycle/MediatorLiveData;

    invoke-static {v1, v0, p1}, Landroidx/lifecycle/Transformations;->d(Landroidx/lifecycle/MediatorLiveData;Lkotlin/jvm/internal/Ref$BooleanRef;Ljava/lang/Object;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Landroidx/lifecycle/j;->c:Ljava/lang/Object;

    check-cast v0, Lr6/c;

    iget-object v1, p0, Landroidx/lifecycle/j;->b:Landroidx/lifecycle/MediatorLiveData;

    invoke-static {v1, v0, p1}, Landroidx/lifecycle/Transformations;->a(Landroidx/lifecycle/MediatorLiveData;Lr6/c;Ljava/lang/Object;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
