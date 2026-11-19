.class public final synthetic Ln4/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/TitleListAdapter;

.field public final synthetic b:I

.field public final synthetic c:Lcom/zykj/study/bean/teach/GetQuizDetailBean;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/TitleListAdapter;ILcom/zykj/study/bean/teach/GetQuizDetailBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/z0;->a:Lcom/zykj/study/adapter/TitleListAdapter;

    iput p2, p0, Ln4/z0;->b:I

    iput-object p3, p0, Ln4/z0;->c:Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ln4/z0;->a:Lcom/zykj/study/adapter/TitleListAdapter;

    iget v1, p0, Ln4/z0;->b:I

    iget-object v2, p0, Ln4/z0;->c:Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/adapter/TitleListAdapter;->d(Lcom/zykj/study/adapter/TitleListAdapter;ILcom/zykj/study/bean/teach/GetQuizDetailBean;Landroid/view/View;)V

    return-void
.end method
