.class public final synthetic Ln4/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/StudentViewMemberAdapter;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/StudentViewMemberAdapter;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/r0;->a:Lcom/zykj/study/adapter/StudentViewMemberAdapter;

    iput p2, p0, Ln4/r0;->b:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/r0;->a:Lcom/zykj/study/adapter/StudentViewMemberAdapter;

    iget v1, p0, Ln4/r0;->b:I

    invoke-static {v0, v1, p1}, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->c(Lcom/zykj/study/adapter/StudentViewMemberAdapter;ILandroid/view/View;)V

    return-void
.end method
