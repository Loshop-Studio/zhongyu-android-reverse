.class public final Lm9/c$a;
.super Lm9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/c;->c(Ljava/lang/String;JZLx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic e:Lx7/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLx7/a;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lm9/c$a;->e:Lx7/a;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lm9/a;-><init>(Ljava/lang/String;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public f()J
    .locals 2

    .line 1
    iget-object v0, p0, Lm9/c$a;->e:Lx7/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    return-wide v0
.end method
