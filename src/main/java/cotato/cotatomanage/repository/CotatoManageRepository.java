package cotato.cotatomanage.repository;

import cotato.cotatomanage.domain.Member;
import cotato.cotatomanage.domain.Part;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CotatoManageRepository {

    private final List<Member> members = new ArrayList<>();

    public void save(Member member){
        members.add(member);
    }

    public List<Member> findAll(){
        return members;
    }

    public List<Member> findByPart(Part part){
        return members.stream()
                .filter(member -> member.getPart().equals(part)
                        .toList());
    }

}
