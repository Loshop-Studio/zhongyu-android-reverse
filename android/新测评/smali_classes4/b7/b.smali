.class public final synthetic Lb7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroid/graphics/Bitmap;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Bitmap;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/b;->a:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lb7/b;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/b;->a:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lb7/b;->b:Ljava/util/List;

    check-cast p1, Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt;->a(Landroid/graphics/Bitmap;Ljava/util/List;Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
