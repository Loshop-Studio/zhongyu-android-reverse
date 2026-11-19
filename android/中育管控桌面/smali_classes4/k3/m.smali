.class public final synthetic Lk3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Lcom/zykj/gallery/bean/GalleryImgBean;

.field public final synthetic c:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/zykj/gallery/bean/GalleryImgBean;Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/m;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lk3/m;->b:Lcom/zykj/gallery/bean/GalleryImgBean;

    iput-object p3, p0, Lk3/m;->c:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iput-boolean p4, p0, Lk3/m;->d:Z

    iput-object p5, p0, Lk3/m;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lk3/m;->f:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lk3/m;->g:Lkotlin/jvm/functions/Function1;

    iput p8, p0, Lk3/m;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lk3/m;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lk3/m;->b:Lcom/zykj/gallery/bean/GalleryImgBean;

    iget-object v2, p0, Lk3/m;->c:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iget-boolean v3, p0, Lk3/m;->d:Z

    iget-object v4, p0, Lk3/m;->e:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lk3/m;->f:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lk3/m;->g:Lkotlin/jvm/functions/Function1;

    iget v7, p0, Lk3/m;->h:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt;->o(Landroidx/compose/ui/Modifier;Lcom/zykj/gallery/bean/GalleryImgBean;Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
