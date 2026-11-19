.class public final synthetic Lv3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/navigation/NavHostController;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/m;->c:Landroidx/navigation/NavHostController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv3/m;->c:Landroidx/navigation/NavHostController;

    check-cast p1, Landroidx/navigation/NavOptionsBuilder;

    invoke-static {v0, p1}, Lcom/friday/main/view/DBActivity;->b0(Landroidx/navigation/NavHostController;Landroidx/navigation/NavOptionsBuilder;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
