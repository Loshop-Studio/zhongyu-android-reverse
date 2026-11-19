.class public final synthetic Ll3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavHostController;

.field public final synthetic b:Lcom/zykj/gallery/ui/share/ShareActivity;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Lcom/zykj/gallery/ui/share/ShareActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/d;->a:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Ll3/d;->b:Lcom/zykj/gallery/ui/share/ShareActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ll3/d;->a:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Ll3/d;->b:Lcom/zykj/gallery/ui/share/ShareActivity;

    check-cast p1, Landroidx/navigation/NavGraphBuilder;

    invoke-static {v0, v1, p1}, Lcom/zykj/gallery/ui/share/ShareActivity;->r(Landroidx/navigation/NavHostController;Lcom/zykj/gallery/ui/share/ShareActivity;Landroidx/navigation/NavGraphBuilder;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
