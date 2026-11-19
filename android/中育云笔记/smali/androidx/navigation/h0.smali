.class public final synthetic Landroidx/navigation/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Landroidx/navigation/Navigation;->b(Landroid/view/View;)Landroidx/navigation/NavController;

    move-result-object p1

    return-object p1
.end method
