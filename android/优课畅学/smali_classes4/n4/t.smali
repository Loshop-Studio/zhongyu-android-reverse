.class public final synthetic Ln4/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/CourseAdapter;

.field public final synthetic b:Lcom/zykj/study/bean/course/CourseSimpleBean;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/CourseAdapter;Lcom/zykj/study/bean/course/CourseSimpleBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/t;->a:Lcom/zykj/study/adapter/CourseAdapter;

    iput-object p2, p0, Ln4/t;->b:Lcom/zykj/study/bean/course/CourseSimpleBean;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/t;->a:Lcom/zykj/study/adapter/CourseAdapter;

    iget-object v1, p0, Ln4/t;->b:Lcom/zykj/study/bean/course/CourseSimpleBean;

    invoke-static {v0, v1}, Lcom/zykj/study/adapter/CourseAdapter;->d(Lcom/zykj/study/adapter/CourseAdapter;Lcom/zykj/study/bean/course/CourseSimpleBean;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
