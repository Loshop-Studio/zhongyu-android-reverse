.class public Landroidx/activity/ComponentActivity$5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/m/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/ComponentActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/activity/ComponentActivity;


# direct methods
.method public constructor <init>(Landroidx/activity/ComponentActivity;)V
    .locals 0

    iput-object p1, p0, Landroidx/activity/ComponentActivity$5;->a:Landroidx/activity/ComponentActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public g(La/m/g;La/m/d$a;)V
    .locals 0

    iget-object p1, p0, Landroidx/activity/ComponentActivity$5;->a:Landroidx/activity/ComponentActivity;

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->l()V

    iget-object p1, p0, Landroidx/activity/ComponentActivity$5;->a:Landroidx/activity/ComponentActivity;

    .line 1
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->d:La/m/h;

    const-string p2, "removeObserver"

    .line 2
    invoke-virtual {p1, p2}, La/m/h;->c(Ljava/lang/String;)V

    iget-object p1, p1, La/m/h;->a:La/c/a/b/a;

    invoke-virtual {p1, p0}, La/c/a/b/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
