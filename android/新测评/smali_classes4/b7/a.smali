.class public final synthetic Lb7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lb7/t0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lb7/t0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/a;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lb7/a;->b:Lb7/t0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/a;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb7/a;->b:Lb7/t0;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt;->d(Lkotlin/jvm/functions/Function1;Lb7/t0;Landroid/content/Context;)Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;

    move-result-object p1

    return-object p1
.end method
