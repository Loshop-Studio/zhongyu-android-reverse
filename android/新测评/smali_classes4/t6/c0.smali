.class public final synthetic Lt6/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lt6/o0;

.field public final synthetic b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

.field public final synthetic c:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lt6/o0;Lcom/zykj/evaluation/ui/home/HomeViewModel;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/c0;->a:Lt6/o0;

    iput-object p2, p0, Lt6/c0;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iput-object p3, p0, Lt6/c0;->c:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lt6/c0;->a:Lt6/o0;

    iget-object v1, p0, Lt6/c0;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iget-object v2, p0, Lt6/c0;->c:Landroidx/navigation/NavController;

    invoke-static {v0, v1, v2}, Lt6/m0;->c(Lt6/o0;Lcom/zykj/evaluation/ui/home/HomeViewModel;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
