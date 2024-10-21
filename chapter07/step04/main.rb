def main(operation, args={})
    case(operation)
    when :pay then calculatePay(args[:name])
    when :basePays then sumOfBasePays()
    end
end

def calculatePay(name)
    taxRate = getTaxRate()
    pay = Employees.calculatePay(name, taxRate)
    puts(describeResult(name, pay))
end

def getTaxRate()
    print("세율을 입력하세요: ")
    return gets().chomp().to_f()
end

def describeResult(name, pay)
    return "이름: #{name}, 급여: #{pay}"
end

def sumOfBasePays()
    puts(Employees.sumOfBasePays())
end
