.class public final synthetic Ln4/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/CourseAdapter;

.field public final synthetic b:Lcom/zykj/study/bean/course/CourseSimpleBean;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/CourseAdapter;Lcom/zykj/study/bean/course/CourseSimpleBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/s;->a:Lcom/zykj/study/adapter/CourseAdapter;

    iput-object p2, p0, Ln4/s;->b:Lcom/zykj/study/bean/course/CourseSimpleBean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/s;->a:Lcom/zykj/study/adapter/CourseAdapter;

    iget-object v1, p0, Ln4/s;->b:Lcom/zykj/study/bean/course/CourseSimpleBean;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/adapter/CourseAdapter;->c(Lcom/zykj/study/adapter/CourseAdapter;Lcom/zykj/study/bean/course/CourseSimpleBean;Landroid/view/View;)V

    return-void
.end method
