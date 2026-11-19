.class public final synthetic Li5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;

.field public final synthetic c:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;I)V
    .locals 0

    .line 1
    iput p3, p0, Li5/a;->a:I

    iput-object p1, p0, Li5/a;->b:Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;

    iput-object p2, p0, Li5/a;->c:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Li5/a;->a:I

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li5/a;->b:Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;

    iget-object v1, p0, Li5/a;->c:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    invoke-static {v0, v1, p1}, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->b(Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;I)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Li5/a;->b:Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;

    iget-object v1, p0, Li5/a;->c:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    invoke-static {v0, v1, p1}, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->a(Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;I)Ld6/s;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
