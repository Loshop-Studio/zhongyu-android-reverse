.class public final Lcom/zykj/huiwei/launcher/app/a$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La5/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/app/a$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/app/a$j;

.field public final b:Lcom/zykj/huiwei/launcher/app/a$d;

.field public final c:Lcom/zykj/huiwei/launcher/app/a$b;

.field public final d:Lcom/zykj/huiwei/launcher/app/a$g;

.field public final e:I


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/app/a$j;Lcom/zykj/huiwei/launcher/app/a$d;Lcom/zykj/huiwei/launcher/app/a$b;Lcom/zykj/huiwei/launcher/app/a$g;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$g$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$g$a;->b:Lcom/zykj/huiwei/launcher/app/a$d;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/zykj/huiwei/launcher/app/a$g$a;->c:Lcom/zykj/huiwei/launcher/app/a$b;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/zykj/huiwei/launcher/app/a$g$a;->d:Lcom/zykj/huiwei/launcher/app/a$g;

    .line 11
    .line 12
    iput p5, p0, Lcom/zykj/huiwei/launcher/app/a$g$a;->e:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/app/a$g$a;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/adapter/HomeworkAdapter;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/ui/adapter/HomeworkAdapter;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 12
    .line 13
    iget v1, p0, Lcom/zykj/huiwei/launcher/app/a$g$a;->e:I

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method
