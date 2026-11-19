.class public final Ldf/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final a:Ldf/b$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldf/b$e;

    .line 2
    .line 3
    invoke-direct {v0}, Ldf/b$e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldf/b$e;->a:Ldf/b$e;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lje/z;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lje/z;->close()V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lje/z;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldf/b$e;->a(Lje/z;)Lqc/q;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
