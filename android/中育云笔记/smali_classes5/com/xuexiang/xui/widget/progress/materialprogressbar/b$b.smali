.class public Lcom/xuexiang/xui/widget/progress/materialprogressbar/b$b;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b$b;->a:Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;Lcom/xuexiang/xui/widget/progress/materialprogressbar/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b$b;-><init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;)V

    return-void
.end method


# virtual methods
.method public getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b$b;->a:Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;

    .line 2
    .line 3
    return-object v0
.end method
