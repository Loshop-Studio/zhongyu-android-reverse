.class public final synthetic Lx6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavHostController;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/k;->a:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Lx6/k;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lx6/k;->a:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Lx6/k;->b:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lx6/m;->b(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
