.class public final synthetic Lk3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Landroidx/paging/compose/LazyPagingItems;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

.field public final synthetic e:Z

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:Lkotlin/jvm/functions/Function0;

.field public final synthetic i:Lkotlin/jvm/functions/Function1;

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Landroidx/paging/compose/LazyPagingItems;Ljava/util/List;Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/c;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lk3/c;->b:Landroidx/paging/compose/LazyPagingItems;

    iput-object p3, p0, Lk3/c;->c:Ljava/util/List;

    iput-object p4, p0, Lk3/c;->d:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iput-boolean p5, p0, Lk3/c;->e:Z

    iput-object p6, p0, Lk3/c;->f:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lk3/c;->g:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lk3/c;->h:Lkotlin/jvm/functions/Function0;

    iput-object p9, p0, Lk3/c;->i:Lkotlin/jvm/functions/Function1;

    iput p10, p0, Lk3/c;->j:I

    iput p11, p0, Lk3/c;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lk3/c;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lk3/c;->b:Landroidx/paging/compose/LazyPagingItems;

    iget-object v2, p0, Lk3/c;->c:Ljava/util/List;

    iget-object v3, p0, Lk3/c;->d:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iget-boolean v4, p0, Lk3/c;->e:Z

    iget-object v5, p0, Lk3/c;->f:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lk3/c;->g:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lk3/c;->h:Lkotlin/jvm/functions/Function0;

    iget-object v8, p0, Lk3/c;->i:Lkotlin/jvm/functions/Function1;

    iget v9, p0, Lk3/c;->j:I

    iget v10, p0, Lk3/c;->k:I

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt;->n(Landroidx/compose/ui/Modifier;Landroidx/paging/compose/LazyPagingItems;Ljava/util/List;Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
