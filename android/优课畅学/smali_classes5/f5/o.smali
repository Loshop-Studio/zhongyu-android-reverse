.class public final synthetic Lf5/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;

.field public final synthetic b:Lcom/zykj/study/bean/SelectModel;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;Lcom/zykj/study/bean/SelectModel;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/o;->a:Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;

    iput-object p2, p0, Lf5/o;->b:Lcom/zykj/study/bean/SelectModel;

    iput p3, p0, Lf5/o;->c:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf5/o;->a:Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;

    iget-object v1, p0, Lf5/o;->b:Lcom/zykj/study/bean/SelectModel;

    iget v2, p0, Lf5/o;->c:I

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->c(Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;Lcom/zykj/study/bean/SelectModel;ILandroid/view/View;)V

    return-void
.end method
