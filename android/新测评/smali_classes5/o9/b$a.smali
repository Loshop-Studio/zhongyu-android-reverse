.class public final Lo9/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:J

.field public b:Ljava/lang/Object;

.field public c:Lo9/b$a;


# direct methods
.method public constructor <init>(JLjava/lang/Object;Lo9/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lo9/b$a;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Lo9/b$a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p4, p0, Lo9/b$a;->c:Lo9/b$a;

    .line 9
    .line 10
    return-void
.end method
