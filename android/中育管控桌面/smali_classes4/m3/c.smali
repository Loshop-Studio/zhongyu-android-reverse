.class public final synthetic Lm3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController;

.field public final synthetic b:Lcom/zykj/gallery/ui/share/page/ShareViewModel;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;Lcom/zykj/gallery/ui/share/page/ShareViewModel;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/c;->a:Landroidx/navigation/NavController;

    iput-object p2, p0, Lm3/c;->b:Lcom/zykj/gallery/ui/share/page/ShareViewModel;

    iput p3, p0, Lm3/c;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lm3/c;->a:Landroidx/navigation/NavController;

    iget-object v1, p0, Lm3/c;->b:Lcom/zykj/gallery/ui/share/page/ShareViewModel;

    iget v2, p0, Lm3/c;->c:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/gallery/ui/share/page/c;->p(Landroidx/navigation/NavController;Lcom/zykj/gallery/ui/share/page/ShareViewModel;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
