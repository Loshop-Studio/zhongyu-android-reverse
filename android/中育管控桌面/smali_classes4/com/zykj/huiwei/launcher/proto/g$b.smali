# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/huiwei/launcher/proto/g$b;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/huiwei/launcher/proto/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/proto/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/g;->q()Lcom/zykj/huiwei/launcher/proto/g;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/proto/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/g$b;-><init>()V

    return-void
.end method


# virtual methods
.method public clearClassId()Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/g;->a(Lcom/zykj/huiwei/launcher/proto/g;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearClassName()Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/g;->b(Lcom/zykj/huiwei/launcher/proto/g;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearEnterSchoolYear()Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/g;->c(Lcom/zykj/huiwei/launcher/proto/g;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearGradeName()Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/g;->d(Lcom/zykj/huiwei/launcher/proto/g;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearId()Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/g;->e(Lcom/zykj/huiwei/launcher/proto/g;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearStudentNumber()Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/g;->f(Lcom/zykj/huiwei/launcher/proto/g;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public getClassId()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/g;->getClassId()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getClassName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/g;->getClassName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getClassNameBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/g;->getClassNameBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getEnterSchoolYear()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/g;->getEnterSchoolYear()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getEnterSchoolYearBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/g;->getEnterSchoolYearBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getGradeName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/g;->getGradeName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getGradeNameBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/g;->getGradeNameBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getId()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/g;->getId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public getStudentNumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/g;->getStudentNumber()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getStudentNumberBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/g;->getStudentNumberBytes()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public setClassId(I)Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->g(Lcom/zykj/huiwei/launcher/proto/g;I)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setClassName(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->h(Lcom/zykj/huiwei/launcher/proto/g;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setClassNameBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->i(Lcom/zykj/huiwei/launcher/proto/g;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setEnterSchoolYear(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->j(Lcom/zykj/huiwei/launcher/proto/g;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setEnterSchoolYearBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->k(Lcom/zykj/huiwei/launcher/proto/g;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setGradeName(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->l(Lcom/zykj/huiwei/launcher/proto/g;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setGradeNameBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->m(Lcom/zykj/huiwei/launcher/proto/g;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setId(J)Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0, p1, p2}, Lcom/zykj/huiwei/launcher/proto/g;->n(Lcom/zykj/huiwei/launcher/proto/g;J)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setStudentNumber(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->o(Lcom/zykj/huiwei/launcher/proto/g;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setStudentNumberBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->p(Lcom/zykj/huiwei/launcher/proto/g;Lcom/google/protobuf/ByteString;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
