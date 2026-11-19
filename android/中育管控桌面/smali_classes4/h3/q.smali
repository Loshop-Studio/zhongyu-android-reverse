.class public final synthetic Lh3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController;

.field public final synthetic b:Lh3/d0;

.field public final synthetic c:Lh3/c0;

.field public final synthetic d:Lkotlin/jvm/functions/Function3;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lcom/zykj/gallery/ui/gallery/detail/DetailViewModel;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;Lh3/d0;Lh3/c0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lcom/zykj/gallery/ui/gallery/detail/DetailViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh3/q;->a:Landroidx/navigation/NavController;

    iput-object p2, p0, Lh3/q;->b:Lh3/d0;

    iput-object p3, p0, Lh3/q;->c:Lh3/c0;

    iput-object p4, p0, Lh3/q;->d:Lkotlin/jvm/functions/Function3;

    iput-object p5, p0, Lh3/q;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lh3/q;->f:Lcom/zykj/gallery/ui/gallery/detail/DetailViewModel;

    iput p7, p0, Lh3/q;->g:I

    iput p8, p0, Lh3/q;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lh3/q;->a:Landroidx/navigation/NavController;

    iget-object v1, p0, Lh3/q;->b:Lh3/d0;

    iget-object v2, p0, Lh3/q;->c:Lh3/c0;

    iget-object v3, p0, Lh3/q;->d:Lkotlin/jvm/functions/Function3;

    iget-object v4, p0, Lh3/q;->e:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lh3/q;->f:Lcom/zykj/gallery/ui/gallery/detail/DetailViewModel;

    iget v6, p0, Lh3/q;->g:I

    iget v7, p0, Lh3/q;->h:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lh3/v;->a(Landroidx/navigation/NavController;Lh3/d0;Lh3/c0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lcom/zykj/gallery/ui/gallery/detail/DetailViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
