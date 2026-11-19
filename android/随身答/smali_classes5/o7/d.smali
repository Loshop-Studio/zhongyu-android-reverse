.class public final synthetic Lo7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/view/widget/radio/CustomColorRadioButton;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/widget/radio/CustomColorRadioButton;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/d;->a:Lcom/zykj/view/widget/radio/CustomColorRadioButton;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/d;->a:Lcom/zykj/view/widget/radio/CustomColorRadioButton;

    invoke-static {v0}, Lcom/zykj/view/widget/radio/CustomColorRadioButton;->c(Lcom/zykj/view/widget/radio/CustomColorRadioButton;)Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method
