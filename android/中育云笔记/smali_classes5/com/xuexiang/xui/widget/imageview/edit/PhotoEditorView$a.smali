.class public Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->b(Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$a;->a:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$a;->a:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->a(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;)Lcom/xuexiang/xui/widget/imageview/edit/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;->c:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/e;->g(Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$a;->a:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->a(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;)Lcom/xuexiang/xui/widget/imageview/edit/e;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/e;->h(Landroid/graphics/Bitmap;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    return-void
.end method
