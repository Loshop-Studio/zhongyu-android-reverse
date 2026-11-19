.class public final Lrd/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrd/h$a;
    }
.end annotation


# static fields
.field public static final a:Lrd/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lrd/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lrd/h;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lrd/h;->a:Lrd/h;

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
.method public a()J
    .locals 2

    .line 1
    sget-object v0, Lrd/g;->a:Lrd/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrd/g;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lrd/g;->a:Lrd/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrd/g;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
