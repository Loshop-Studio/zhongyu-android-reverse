.class public final synthetic Lt7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/play/PlaySettingAdapter;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/PlaySettingAdapter;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/c;->a:Lcom/zykj/view/board/play/PlaySettingAdapter;

    iput p2, p0, Lt7/c;->b:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt7/c;->a:Lcom/zykj/view/board/play/PlaySettingAdapter;

    iget v1, p0, Lt7/c;->b:I

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/play/PlaySettingAdapter;->b(Lcom/zykj/view/board/play/PlaySettingAdapter;ILandroid/view/View;)V

    return-void
.end method
