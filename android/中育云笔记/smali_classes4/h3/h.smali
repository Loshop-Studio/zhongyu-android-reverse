.class public final synthetic Lh3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh3/h;->c:Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;

    iput-wide p2, p0, Lh3/h;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh3/h;->c:Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;

    iget-wide v1, p0, Lh3/h;->d:J

    invoke-static {v0, v1, v2}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->j(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;J)V

    return-void
.end method
