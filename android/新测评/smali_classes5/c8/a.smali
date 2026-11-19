.class public final synthetic Lc8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;

.field public final synthetic b:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc8/a;->a:Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;

    iput-object p2, p0, Lc8/a;->b:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc8/a;->a:Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;

    iget-object v1, p0, Lc8/a;->b:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->a(Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
