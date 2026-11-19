.class public final synthetic Lf5/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/bean/SelectModel;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->d(Lcom/zykj/study/bean/SelectModel;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
